.class final LA8/f$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/f;->B0()V
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

    iput-object p1, p0, LA8/f$g;->a:LA8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LA8/f$g;->a:LA8/f;

    invoke-static {p1}, LA8/f;->w0(LA8/f;)Li8/a;

    move-result-object p1

    new-instance v0, Li8/a$b$c;

    sget-object v1, LQe/c$a;->SIGNAL:LQe/c$a;

    invoke-direct {v0, v1}, Li8/a$b$c;-><init>(LQe/c$a;)V

    const/4 v1, 0x1

    new-array v1, v1, [Li8/a$b;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LA8/f$g;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
