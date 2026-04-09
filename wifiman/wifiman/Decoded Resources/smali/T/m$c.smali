.class public final LT/m$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/m;-><init>(LT/f;LT/q;LT/b1;Ljava/util/Set;LU/a;LU/a;LT/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/m;


# direct methods
.method constructor <init>(LT/m;)V
    .locals 0

    iput-object p1, p0, LT/m$c;->a:LT/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LT/H;)V
    .locals 1

    iget-object p1, p0, LT/m$c;->a:LT/m;

    invoke-static {p1}, LT/m;->Z(LT/m;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, LT/m;->f0(LT/m;I)V

    return-void
.end method

.method public b(LT/H;)V
    .locals 1

    iget-object p1, p0, LT/m$c;->a:LT/m;

    invoke-static {p1}, LT/m;->Z(LT/m;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, LT/m;->f0(LT/m;I)V

    return-void
.end method
