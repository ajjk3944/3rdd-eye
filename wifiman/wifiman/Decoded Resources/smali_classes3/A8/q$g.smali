.class final LA8/q$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/q;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/q;


# direct methods
.method constructor <init>(LA8/q;)V
    .locals 0

    iput-object p1, p0, LA8/q$g;->a:LA8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LXe/a;)LDj/a;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA8/q$g;->a:LA8/q;

    invoke-static {v0}, LA8/q;->v0(LA8/q;)Lod/b;

    move-result-object v0

    invoke-virtual {p1}, LXe/a;->a()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lod/b;->e(J)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LXe/a;

    invoke-virtual {p0, p1}, LA8/q$g;->a(LXe/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
