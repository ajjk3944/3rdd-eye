.class final Lv7/j$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv7/j;->a()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv7/j;


# direct methods
.method constructor <init>(Lv7/j;)V
    .locals 0

    iput-object p1, p0, Lv7/j$a;->a:Lv7/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lv7/f;)Ljava/lang/Boolean;
    .locals 4

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lv7/f;->a()J

    move-result-wide v0

    iget-object p1, p0, Lv7/j$a;->a:Lv7/j;

    invoke-static {p1}, Lv7/j;->e(Lv7/j;)J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv7/f;

    invoke-virtual {p0, p1}, Lv7/j$a;->a(Lv7/f;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
