.class public final Lr/A0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/A0;-><init>(Lr/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/I;


# direct methods
.method constructor <init>(Lr/I;)V
    .locals 0

    iput-object p1, p0, Lr/A0$a;->a:Lr/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)Lr/I;
    .locals 0

    iget-object p1, p0, Lr/A0$a;->a:Lr/I;

    return-object p1
.end method
