.class public final LDh/z$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDh/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LDh/z$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBh/e;Lpi/E0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeSubstitution"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LDh/z;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LDh/z;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p2, p3}, LDh/z;->I(Lpi/E0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p3

    if-nez p3, :cond_2

    :cond_1
    invoke-interface {p1, p2}, LBh/e;->w0(Lpi/E0;)Lii/k;

    move-result-object p3

    const-string p1, "getMemberScope(...)"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-object p3
.end method

.method public final b(LBh/e;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LDh/z;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LDh/z;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p2}, LDh/z;->i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p2

    if-nez p2, :cond_2

    :cond_1
    invoke-interface {p1}, LBh/e;->E0()Lii/k;

    move-result-object p2

    const-string p1, "getUnsubstitutedMemberScope(...)"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-object p2
.end method
