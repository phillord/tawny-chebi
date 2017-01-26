;; The contents of this file are subject to the LGPL License, Version 3.0.

;; Copyright (C) 2017 Newcastle University

;; This program is free software: you can redistribute it and/or modify
;; it under the terms of the GNU General Public License as published by
;; the Free Software Foundation, either version 3 of the License, or
;; (at your option) any later version.

;; This program is distributed in the hope that it will be useful,
;; but WITHOUT ANY WARRANTY; without even the implied warranty of
;; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;; GNU General Public License for more details.
;; You should have received a copy of the GNU General Public License
;; along with this program.  If not, see http://www.gnu.org/licenses/.

(ns tawny-chebi.chebi
  (:refer-clojure :only [partial])
  (:require [tawny read memorise]))

;; TOFIX Make into function with variable location (default local
;; resource) should be able to use latest from bioontology.
;; "Reads in the chebi ontology from resource"
(tawny.read/defread chebi
  :location
  (tawny.owl/iri (clojure.java.io/resource "chebi.owl"))
  :iri "http://purl.obolibrary.org/obo/chebi.owl"
  :viri "http://purl.obolibrary.org/obo/chebi/147/chebi.owl"
  :prefix "chebi:"
  :filter
  (partial tawny.read/iri-starts-with-filter
           "http://purl.obolibrary.org/obo/CHEBI")
  :transform
  tawny.read/exception-nil-label-transform
  )

;; TOFIX
;; (tawny.memorise/remember "./src/tawny_chebi/chebi_memorise.edn")
;; (tawny.memorise/memorise "./src/tawny_chebi/chebi_memorise.edn")
