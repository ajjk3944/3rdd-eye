.class final LF/k$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/k;->a(LJ/j;ZLmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv/i;


# direct methods
.method constructor <init>(Lv/i;)V
    .locals 0

    iput-object p1, p0, LF/k$c;->a:Lv/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LF/k$c;->a:Lv/i;

    invoke-static {v0}, Lv/j;->a(Lv/i;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF/k$c;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
