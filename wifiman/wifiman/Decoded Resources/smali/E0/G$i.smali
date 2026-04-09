.class final LE0/G$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/G;-><init>(ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/G;


# direct methods
.method constructor <init>(LE0/G;)V
    .locals 0

    iput-object p1, p0, LE0/G$i;->a:LE0/G;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LE0/G$i;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->U()LE0/L;

    move-result-object v0

    invoke-virtual {v0}, LE0/L;->N()V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE0/G$i;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
