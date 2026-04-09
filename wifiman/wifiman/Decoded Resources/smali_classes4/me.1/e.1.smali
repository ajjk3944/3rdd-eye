.class public final Lme/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lme/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/e$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Lkotlin/text/p;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lme/e$a;->getEntries()Lfh/a;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lme/e$a;

    invoke-virtual {v3}, Lme/e$a;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object v2, p0, Lme/e;->a:Ljava/util/Map;

    new-instance v0, Lkotlin/text/p;

    const-string v1, "\\[([^\\[\\]]+)\\]"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lme/e;->b:Lkotlin/text/p;

    return-void
.end method

.method public static synthetic b(Lkotlin/text/l;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lme/e;->e(Lkotlin/text/l;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;)Lzi/j;
    .locals 0

    invoke-static {p0}, Lme/e;->f(Ljava/lang/String;)Lzi/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lme/e;Ljava/lang/String;)Lme/e$a;
    .locals 0

    invoke-static {p0, p1}, Lme/e;->g(Lme/e;Ljava/lang/String;)Lme/e$a;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/text/l;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lkotlin/text/l;->c()Lkotlin/text/k;

    move-result-object p0

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lkotlin/text/k;->get(I)Lkotlin/text/j;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lkotlin/text/j;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final f(Ljava/lang/String;)Lzi/j;
    .locals 7

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "+"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lkotlin/text/t;->S0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Lzi/j;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lme/e;Ljava/lang/String;)Lme/e$a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lme/e;->a:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lme/e$a;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)LS8/j;
    .locals 12

    const-string v0, "capabilities"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LS8/j;->c:LS8/j$a;

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v1

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v2, p0, Lme/e;->b:Lkotlin/text/p;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, p1, v3, v4, v5}, Lkotlin/text/p;->h(Lkotlin/text/p;Ljava/lang/CharSequence;IILjava/lang/Object;)Lzi/j;

    move-result-object v2

    invoke-static {v2}, Lzi/m;->v(Lzi/j;)Z

    move-result v6

    if-eqz v6, :cond_1

    new-instance p1, Lme/b;

    invoke-direct {p1}, Lme/b;-><init>()V

    invoke-static {v2, p1}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    goto :goto_0

    :cond_1
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->s([Ljava/lang/Object;)Lzi/j;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v6, "-"

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v2

    invoke-static/range {v6 .. v11}, Lkotlin/text/t;->S0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Lzi/j;

    move-result-object v6

    new-instance v7, Lme/c;

    invoke-direct {v7}, Lme/c;-><init>()V

    invoke-static {v6, v7}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v6

    invoke-static {v6}, Lzi/m;->j(Lzi/j;)Lzi/j;

    move-result-object v6

    new-instance v7, Lme/d;

    invoke-direct {v7, p0}, Lme/d;-><init>(Lme/e;)V

    invoke-static {v6, v7}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v6

    invoke-static {v6}, Lzi/m;->Y(Lzi/j;)Ljava/util/HashSet;

    move-result-object v6

    sget-object v7, Lme/e$a;->WEP:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    sget-object v7, LS8/j$b$e;->a:LS8/j$b$e;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    sget-object v7, Lme/e$a;->WAPI:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    sget-object v7, LS8/j$b$d;->a:LS8/j$b$d;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4
    sget-object v7, Lme/e$a;->WPS:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    sget-object v7, LS8/j$b$i;->a:LS8/j$b$i;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_5
    sget-object v7, Lme/e$a;->WPA:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    sget-object v7, Lme/e$a;->PSK:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    sget-object v7, LS8/j$b$f$b;->a:LS8/j$b$f$b;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_6
    sget-object v7, Lme/e$a;->PSK_FT:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    sget-object v7, LS8/j$b$f$b;->a:LS8/j$b$f$b;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_7
    sget-object v7, Lme/e$a;->EAP:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    sget-object v8, LS8/j$b$f$a;->a:LS8/j$b$f$a;

    invoke-interface {v1, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_8
    sget-object v8, Lme/e$a;->EAP_SHA1:Lme/e$a;

    invoke-virtual {v6, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    sget-object v8, LS8/j$b$f$a;->a:LS8/j$b$f$a;

    invoke-interface {v1, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_9
    sget-object v8, Lme/e$a;->EAP_FT:Lme/e$a;

    invoke-virtual {v6, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    sget-object v8, LS8/j$b$f$a;->a:LS8/j$b$f$a;

    invoke-interface {v1, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_a
    sget-object v8, Lme/e$a;->EAP_FILS:Lme/e$a;

    invoke-virtual {v6, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    sget-object v8, LS8/j$b$f$a;->a:LS8/j$b$f$a;

    invoke-interface {v1, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v8, LS8/j$b$a;->a:LS8/j$b$a;

    invoke-interface {v1, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-virtual {v7}, Lme/e$a;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7, v3, v4, v5}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    sget-object v7, Lme/e$a;->ENC_SHA1:Lme/e$a;

    invoke-virtual {v7}, Lme/e$a;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7, v3, v4, v5}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    sget-object v7, LS8/j$b$f$a;->a:LS8/j$b$f$a;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_c
    sget-object v7, Lme/e$a;->WPA2:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    sget-object v7, Lme/e$a;->RSN:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_14

    :cond_d
    sget-object v7, Lme/e$a;->PSK:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    sget-object v7, LS8/j$b$g$b;->a:LS8/j$b$g$b;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_e
    sget-object v7, Lme/e$a;->PSK_FT:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    sget-object v7, LS8/j$b$g$b;->a:LS8/j$b$g$b;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_f
    sget-object v7, Lme/e$a;->EAP_SHA1:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_10

    sget-object v7, LS8/j$b$g$a;->a:LS8/j$b$g$a;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_10
    sget-object v7, Lme/e$a;->ENC_SHA256:Lme/e$a;

    invoke-virtual {v7}, Lme/e$a;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7, v3, v4, v5}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_13

    sget-object v7, Lme/e$a;->EAP:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    sget-object v7, LS8/j$b$g$a;->a:LS8/j$b$g$a;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_11
    sget-object v7, Lme/e$a;->EAP_FT:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_12

    sget-object v7, LS8/j$b$g$a;->a:LS8/j$b$g$a;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_12
    sget-object v7, Lme/e$a;->EAP_FILS:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_13

    sget-object v7, LS8/j$b$g$a;->a:LS8/j$b$g$a;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v7, LS8/j$b$a;->a:LS8/j$b$a;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_13
    sget-object v7, Lme/e$a;->EAP:Lme/e$a;

    invoke-virtual {v7}, Lme/e$a;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7, v3, v4, v5}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_14

    sget-object v7, Lme/e$a;->ENC_SHA1:Lme/e$a;

    invoke-virtual {v7}, Lme/e$a;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7, v3, v4, v5}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_14

    sget-object v7, LS8/j$b$g$a;->a:LS8/j$b$g$a;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_14
    sget-object v7, Lme/e$a;->SAE:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_15

    sget-object v8, LS8/j$b$h$d;->a:LS8/j$b$h$d;

    invoke-interface {v1, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_15
    sget-object v8, Lme/e$a;->SAE_FT:Lme/e$a;

    invoke-virtual {v6, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_16

    sget-object v8, LS8/j$b$h$d;->a:LS8/j$b$h$d;

    invoke-interface {v1, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_16
    invoke-virtual {v7}, Lme/e$a;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7, v3, v4, v5}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    sget-object v7, LS8/j$b$h$d;->a:LS8/j$b$h$d;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_17
    sget-object v7, Lme/e$a;->EAP_SHA256:Lme/e$a;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_18

    sget-object v7, LS8/j$b$h$b;->a:LS8/j$b$h$b;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_18
    sget-object v7, Lme/e$a;->EAP_SUITE_B_192:Lme/e$a;

    invoke-virtual {v7}, Lme/e$a;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7, v3, v4, v5}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_19

    sget-object v7, LS8/j$b$h$b;->a:LS8/j$b$h$b;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_19
    sget-object v7, Lme/e$a;->EAP:Lme/e$a;

    invoke-virtual {v7}, Lme/e$a;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7, v3, v4, v5}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1b

    sget-object v7, Lme/e$a;->ENC_SHA256:Lme/e$a;

    invoke-virtual {v7}, Lme/e$a;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7, v3, v4, v5}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1a

    sget-object v7, LS8/j$b$h$b;->a:LS8/j$b$h$b;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1a
    sget-object v7, Lme/e$a;->ENC_SUITE_B:Lme/e$a;

    invoke-virtual {v7}, Lme/e$a;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7, v3, v4, v5}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    sget-object v2, LS8/j$b$h$b;->a:LS8/j$b$h$b;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1b
    sget-object v2, Lme/e$a;->OWE_TRANSITION:Lme/e$a;

    invoke-virtual {v6, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    sget-object v2, LS8/j$b$h$c;->a:LS8/j$b$h$c;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v2, LS8/j$b$b;->a:LS8/j$b$b;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1c
    sget-object v2, Lme/e$a;->OWE:Lme/e$a;

    invoke-virtual {v6, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    sget-object v2, LS8/j$b$h$c;->a:LS8/j$b$h$c;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1d
    sget-object v2, Lme/e$a;->DPP:Lme/e$a;

    invoke-virtual {v6, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, LS8/j$b$h$a;->a:LS8/j$b$h$a;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_1e
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1f

    sget-object p1, LS8/j$b$b;->a:LS8/j$b$b;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1f
    :goto_2
    invoke-static {v1}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p1}, LS8/j$a;->a(Ljava/util/Set;)LS8/j;

    move-result-object p1

    return-object p1
.end method
