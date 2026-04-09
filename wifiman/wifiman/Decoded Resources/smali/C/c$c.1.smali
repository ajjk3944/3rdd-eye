.class final LC/c$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/c;->a(Landroidx/compose/ui/e;LC/C;Lz/N;ZLw/q;Lw/C;ZIFLC/g;Lx0/a;Lmh/l;Lf0/c$b;Lf0/c$c;Lx/j;Lmh/r;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/C;


# direct methods
.method constructor <init>(LC/C;)V
    .locals 0

    iput-object p1, p0, LC/c$c;->a:LC/C;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, LC/c$c;->a:LC/C;

    invoke-virtual {v0}, LC/C;->F()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC/c$c;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
