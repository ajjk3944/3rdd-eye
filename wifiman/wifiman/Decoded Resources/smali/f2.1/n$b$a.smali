.class final Lf2/n$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/n$b;->g(Lf2/k;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/n$b;

.field final synthetic b:Lf2/k;

.field final synthetic c:Z


# direct methods
.method constructor <init>(Lf2/n$b;Lf2/k;Z)V
    .locals 0

    iput-object p1, p0, Lf2/n$b$a;->a:Lf2/n$b;

    iput-object p2, p0, Lf2/n$b$a;->b:Lf2/k;

    iput-boolean p3, p0, Lf2/n$b$a;->c:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lf2/n$b$a;->a:Lf2/n$b;

    iget-object v1, p0, Lf2/n$b$a;->b:Lf2/k;

    iget-boolean v2, p0, Lf2/n$b$a;->c:Z

    invoke-static {v0, v1, v2}, Lf2/n$b;->m(Lf2/n$b;Lf2/k;Z)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf2/n$b$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
