.class public final LC/C$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/O;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/C;-><init>(IFLB/Q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/C;


# direct methods
.method constructor <init>(LC/C;)V
    .locals 0

    iput-object p1, p0, LC/C$c;->a:LC/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public X(LC0/N;)V
    .locals 1

    iget-object v0, p0, LC/C$c;->a:LC/C;

    invoke-static {v0, p1}, LC/C;->l(LC/C;LC0/N;)V

    return-void
.end method
