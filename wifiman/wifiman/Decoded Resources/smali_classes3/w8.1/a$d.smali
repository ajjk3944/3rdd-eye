.class final Lw8/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/a;->p0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw8/a;


# direct methods
.method constructor <init>(Lw8/a;)V
    .locals 0

    iput-object p1, p0, Lw8/a$d;->a:Lw8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li8/a$b$D$d;)Lgg/f;
    .locals 4

    const-string/jumbo v0, "emailComposerRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lw8/a$d;->a:Lw8/a;

    invoke-static {v0}, Lw8/a;->s0(Lw8/a;)Li8/a;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$n;->a:Li8/a$b$n;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-interface {v0, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li8/a$b$D$d;

    invoke-virtual {p0, p1}, Lw8/a$d;->a(Li8/a$b$D$d;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
