.class final LA8/f$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/f;->p0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/f;


# direct methods
.method constructor <init>(LA8/f;)V
    .locals 0

    iput-object p1, p0, LA8/f$h;->a:LA8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWe/a;)Lgg/f;
    .locals 4

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA8/f$h;->a:LA8/f;

    invoke-static {v0}, LA8/f;->w0(LA8/f;)Li8/a;

    move-result-object v0

    new-instance v1, Li8/a$b$k$a;

    invoke-virtual {p1}, LWe/a;->a()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Li8/a$b$k$a;-><init>(J)V

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    const/4 v2, 0x0

    aput-object v1, p1, v2

    invoke-interface {v0, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWe/a;

    invoke-virtual {p0, p1}, LA8/f$h;->a(LWe/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
