.class final LD8/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/a;->r0(Ldf/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/a;


# direct methods
.method constructor <init>(LD8/a;)V
    .locals 0

    iput-object p1, p0, LD8/a$f;->a:LD8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li8/a$b;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "viewRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/a$f;->a:LD8/a;

    invoke-static {v0}, LD8/a;->s0(LD8/a;)Li8/a;

    move-result-object v0

    filled-new-array {p1}, [Li8/a$b;

    move-result-object p1

    invoke-interface {v0, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li8/a$b;

    invoke-virtual {p0, p1}, LD8/a$f;->a(Li8/a$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
