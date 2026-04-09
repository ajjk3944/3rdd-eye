.class public final LA/B$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/O;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/B;-><init>(IILA/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LA/B;


# direct methods
.method constructor <init>(LA/B;)V
    .locals 0

    iput-object p1, p0, LA/B$f;->a:LA/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public X(LC0/N;)V
    .locals 1

    iget-object v0, p0, LA/B$f;->a:LA/B;

    invoke-static {v0, p1}, LA/B;->k(LA/B;LC0/N;)V

    return-void
.end method
