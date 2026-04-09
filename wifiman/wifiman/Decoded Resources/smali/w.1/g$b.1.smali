.class public final Lw/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/g;-><init>(Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/g;


# direct methods
.method constructor <init>(Lw/g;)V
    .locals 0

    iput-object p1, p0, Lw/g$b;->a:Lw/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Lw/g$b;->a:Lw/g;

    invoke-virtual {v0}, Lw/g;->e()Lmh/l;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
