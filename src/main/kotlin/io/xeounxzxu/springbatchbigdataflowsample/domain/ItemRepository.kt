package io.xeounxzxu.springbatchbigdataflowsample.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository : JpaRepository<ItemEntity, Int> {}
