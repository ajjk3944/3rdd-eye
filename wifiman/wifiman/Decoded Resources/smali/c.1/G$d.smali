.class final Lc/G$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/G;-><init>(Ljava/lang/Runnable;LE1/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/G;


# direct methods
.method constructor <init>(Lc/G;)V
    .locals 0

    iput-object p1, p0, Lc/G$d;->a:Lc/G;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lc/G$d;->a:Lc/G;

    invoke-static {v0}, Lc/G;->c(Lc/G;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lc/G$d;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
