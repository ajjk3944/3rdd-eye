.class public final Lzi/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzi/n;->b(Lmh/p;)Lzi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;


# direct methods
.method public constructor <init>(Lmh/p;)V
    .locals 0

    iput-object p1, p0, Lzi/n$a;->a:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lzi/n$a;->a:Lmh/p;

    invoke-static {v0}, Lzi/m;->a(Lmh/p;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
