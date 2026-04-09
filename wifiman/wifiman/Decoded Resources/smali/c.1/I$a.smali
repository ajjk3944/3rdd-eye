.class public final Lc/I$a;
.super Lc/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/I;->a(Lc/G;Landroidx/lifecycle/o;ZLmh/l;)Lc/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lmh/l;


# direct methods
.method constructor <init>(ZLmh/l;)V
    .locals 0

    iput-object p2, p0, Lc/I$a;->d:Lmh/l;

    invoke-direct {p0, p1}, Lc/F;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    iget-object v0, p0, Lc/I$a;->d:Lmh/l;

    invoke-interface {v0, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
