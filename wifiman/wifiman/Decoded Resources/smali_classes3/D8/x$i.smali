.class final LD8/x$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/x;->B0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/x;


# direct methods
.method constructor <init>(LD8/x;)V
    .locals 0

    iput-object p1, p0, LD8/x$i;->a:LD8/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Lgg/f;
    .locals 8

    const-string/jumbo v0, "resultId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/x$i;->a:LD8/x;

    invoke-static {v0}, LD8/x;->J0(LD8/x;)Li8/a;

    move-result-object v0

    new-instance v7, Li8/a$b$B$b$a;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Li8/a$b$B$b$a;-><init>(JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    const/4 v1, 0x0

    aput-object v7, p1, v1

    invoke-interface {v0, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LD8/x$i;->a(Ljava/lang/Long;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
