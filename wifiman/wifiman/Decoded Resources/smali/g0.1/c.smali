.class public abstract Lg0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lg0/a;Landroid/util/SparseArray;)V
    .locals 6

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/autofill/AutofillValue;

    sget-object v4, Lg0/f;->a:Lg0/f;

    invoke-virtual {v4, v3}, Lg0/f;->d(Landroid/view/autofill/AutofillValue;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p0}, Lg0/a;->d()Lg0/i;

    move-result-object v5

    invoke-virtual {v4, v3}, Lg0/f;->i(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v2, v3}, Lg0/i;->b(ILjava/lang/String;)LYg/J;

    goto :goto_1

    :cond_0
    invoke-virtual {v4, v3}, Lg0/f;->b(Landroid/view/autofill/AutofillValue;)Z

    move-result v2

    const-string v5, "An operation is not implemented: "

    if-nez v2, :cond_3

    invoke-virtual {v4, v3}, Lg0/f;->c(Landroid/view/autofill/AutofillValue;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v4, v3}, Lg0/f;->e(Landroid/view/autofill/AutofillValue;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, LYg/r;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "b/138604541:  Add onFill() callback for toggle"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, LYg/r;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, LYg/r;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "b/138604541: Add onFill() callback for list"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, LYg/r;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, LYg/r;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "b/138604541: Add onFill() callback for date"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, LYg/r;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return-void
.end method

.method public static final b(Lg0/a;Landroid/view/ViewStructure;)V
    .locals 16

    move-object/from16 v0, p1

    sget-object v1, Lg0/e;->a:Lg0/e;

    invoke-virtual/range {p0 .. p0}, Lg0/a;->d()Lg0/i;

    move-result-object v2

    invoke-virtual {v2}, Lg0/i;->a()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lg0/e;->a(Landroid/view/ViewStructure;I)I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lg0/a;->d()Lg0/i;

    move-result-object v2

    invoke-virtual {v2}, Lg0/i;->a()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg0/h;

    sget-object v5, Lg0/e;->a:Lg0/e;

    invoke-virtual {v5, v0, v1}, Lg0/e;->b(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;

    move-result-object v4

    if-eqz v4, :cond_2

    sget-object v11, Lg0/f;->a:Lg0/f;

    invoke-virtual {v11, v0}, Lg0/f;->a(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v11, v4, v6, v7}, Lg0/f;->g(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V

    invoke-virtual/range {p0 .. p0}, Lg0/a;->e()Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, v4

    invoke-virtual/range {v5 .. v10}, Lg0/e;->d(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v5, Lg0/k;->a:Lg0/k$a;

    invoke-virtual {v5}, Lg0/k$a;->a()I

    move-result v5

    invoke-virtual {v11, v4, v5}, Lg0/f;->h(Landroid/view/ViewStructure;I)V

    invoke-virtual {v3}, Lg0/h;->c()Ljava/util/List;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x0

    move v9, v8

    :goto_1
    if-ge v9, v7, :cond_0

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg0/j;

    invoke-static {v10}, Lg0/b;->a(Lg0/j;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v6, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_0
    new-array v5, v8, [Ljava/lang/String;

    invoke-interface {v6, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ljava/lang/String;

    invoke-virtual {v11, v4, v5}, Lg0/f;->f(Landroid/view/ViewStructure;[Ljava/lang/String;)V

    invoke-virtual {v3}, Lg0/h;->d()Ll0/i;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, "Autofill Warning"

    const-string v4, "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? "

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_1
    invoke-virtual {v3}, Ll0/i;->k()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v10

    invoke-virtual {v3}, Ll0/i;->n()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v11

    invoke-virtual {v3}, Ll0/i;->l()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {v3}, Ll0/i;->e()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    sub-int v14, v5, v10

    sub-int v15, v3, v11

    sget-object v8, Lg0/e;->a:Lg0/e;

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v4

    invoke-virtual/range {v8 .. v15}, Lg0/e;->c(Landroid/view/ViewStructure;IIIIII)V

    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_3
    return-void
.end method
