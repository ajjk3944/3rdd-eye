.class final Lc/G$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


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

    iput-object p1, p0, Lc/G$a;->a:Lc/G;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc/b;)V
    .locals 1

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/G$a;->a:Lc/G;

    invoke-static {v0, p1}, Lc/G;->e(Lc/G;Lc/b;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc/b;

    invoke-virtual {p0, p1}, Lc/G$a;->a(Lc/b;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
