.class final Lb1/o$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/o;-><init>(Lb1/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb1/o;


# direct methods
.method constructor <init>(Lb1/o;)V
    .locals 0

    iput-object p1, p0, Lb1/o$c;->a:Lb1/o;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)V
    .locals 1

    iget-object p1, p0, Lb1/o$c;->a:Lb1/o;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb1/o;->j(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Lb1/o$c;->a(LYg/J;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
