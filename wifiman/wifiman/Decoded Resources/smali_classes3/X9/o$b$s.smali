.class public final LX9/o$b$s;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/o$b;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb1/z;


# direct methods
.method public constructor <init>(Lb1/z;)V
    .locals 0

    iput-object p1, p0, LX9/o$b$s;->a:Lb1/z;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/w;)V
    .locals 1

    iget-object v0, p0, LX9/o$b$s;->a:Lb1/z;

    invoke-static {p1, v0}, Lb1/C;->a(LJ0/w;Lb1/r;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, LX9/o$b$s;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
