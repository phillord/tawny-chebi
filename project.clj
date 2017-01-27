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

(defproject tawny-chebi "1.0.0"
  :description "A mavenized version of ChEBI"
  :dependencies [[uk.org.russet/tawny-owl "1.6.0-SNAPSHOT"]]
  :scm {:url "https://github.com/jaydchan/tawny-chebi.git"
        :name "git"}
  :license {:name "LGPL"
            :url "http://www.gnu.org/licenses/lgpl-3.0.txt"
            :distribution :repo}
  :jvm-opts ["-Xmx1000m"]
  ;; :main tawny-chebi.core
  )
