(ns soda-ash.runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [soda-ash.elements.button-test]
   [soda-ash.elements.container-test]
   [soda-ash.elements.divider-test]
   [soda-ash.elements.flag-test]
   [soda-ash.elements.header-test]
   [soda-ash.elements.helpers-test]
   [soda-ash.elements.icon-test]
   [soda-ash.elements.image-test]
   [soda-ash.elements.input-test]
   [soda-ash.elements.label-test]
   [soda-ash.elements.loader-test]
   [soda-ash.elements.rail-test]
   [soda-ash.elements.reveal-test]
   [soda-ash.elements.segment-test]
   [soda-ash.elements.step-test]
   [soda-ash.elements.template-test]))


(doo-tests
 'soda-ash.elements.button-test
 'soda-ash.elements.container-test
 'soda-ash.elements.divider-test
 'soda-ash.elements.header-test
 'soda-ash.elements.flag-test
 'soda-ash.elements.helpers-test
 'soda-ash.elements.icon-test
 'soda-ash.elements.image-test
 'soda-ash.elements.input-test
 'soda-ash.elements.label-test
 'soda-ash.elements.loader-test
 'soda-ash.elements.rail-test
 'soda-ash.elements.reveal-test
 'soda-ash.elements.segment-test
 'soda-ash.elements.step-test
 'soda-ash.elements.template-test)
