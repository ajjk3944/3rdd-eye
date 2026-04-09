.class final LD8/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/i;->a(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD8/i$c$a;
    }
.end annotation


# instance fields
.field final synthetic a:LD8/i;


# direct methods
.method constructor <init>(LD8/i;)V
    .locals 0

    iput-object p1, p0, LD8/i$c;->a:LD8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laf/J;)Lgg/f;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string/jumbo v2, "warning"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LD8/i$c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v1, :cond_3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_2

    const/4 v2, 0x3

    if-eq p1, v2, :cond_1

    const/4 v2, 0x4

    if-ne p1, v2, :cond_0

    iget-object p1, p0, LD8/i$c;->a:LD8/i;

    invoke-static {p1}, LD8/i;->d(LD8/i;)Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/n;->a:Li8/n;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, LD8/i$c;->a:LD8/i;

    invoke-static {p1}, LD8/i;->d(LD8/i;)Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/m;->a:Li8/m;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p1, p0, LD8/i$c;->a:LD8/i;

    invoke-static {p1}, LD8/i;->d(LD8/i;)Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/k;->a:Li8/k;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_3
    iget-object p1, p0, LD8/i$c;->a:LD8/i;

    invoke-static {p1}, LD8/i;->d(LD8/i;)Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/l;->a:Li8/l;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Laf/J;

    invoke-virtual {p0, p1}, LD8/i$c;->a(Laf/J;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
