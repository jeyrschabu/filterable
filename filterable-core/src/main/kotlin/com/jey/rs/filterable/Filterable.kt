package com.jey.rs.filterable

/**
 * An interface marking an object as filterable.
 */
interface Filterable {
  fun apply(filters: List<Filter>): FilterResult
}

/**
 * @property filterType this filter type
 */
data class FilterResult(
  val filterType: FilterType
)

enum class FilterType {
  /**
   * A whitelisting filter
   */
  INCLUDE,

  /**
   * Natural filter
   */
  EXCLUDE
}
