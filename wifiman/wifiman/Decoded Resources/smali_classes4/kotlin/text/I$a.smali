.class public final Lkotlin/text/I$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/text/I;->s0(Ljava/lang/CharSequence;)Lzi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lkotlin/text/I$a;->a:Ljava/lang/CharSequence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lkotlin/text/i;

    iget-object v1, p0, Lkotlin/text/I$a;->a:Ljava/lang/CharSequence;

    invoke-direct {v0, v1}, Lkotlin/text/i;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method
