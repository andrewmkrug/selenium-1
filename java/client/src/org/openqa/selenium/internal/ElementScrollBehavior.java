/*
Copyright 2012 Selenium committers
Portions copyright 2012 Software Freedom Conservancy

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.openqa.selenium.internal;

public enum ElementScrollBehavior {

  TOP (0),
  BOTTOM (1),
  ;

  private int value;

  private ElementScrollBehavior(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
  
  public static ElementScrollBehavior fromString(String text) {
    for (ElementScrollBehavior b : ElementScrollBehavior.values()) {
      if (text.equalsIgnoreCase(b.toString())) {
        return b;
      }
    }
    return null;
  }
}