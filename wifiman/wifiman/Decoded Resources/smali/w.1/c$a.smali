.class final Lw/c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/c;->c(Lw/f$a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/c;

.field final synthetic b:Lw/f$a;


# direct methods
.method constructor <init>(Lw/c;Lw/f$a;)V
    .locals 0

    iput-object p1, p0, Lw/c$a;->a:Lw/c;

    iput-object p2, p0, Lw/c$a;->b:Lw/f$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lw/c$a;->a:Lw/c;

    invoke-static {p1}, Lw/c;->a(Lw/c;)LV/b;

    move-result-object p1

    iget-object v0, p0, Lw/c$a;->b:Lw/f$a;

    invoke-virtual {p1, v0}, LV/b;->x(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lw/c$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
