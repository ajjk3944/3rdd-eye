.class public final Lr/p0$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/p0$e;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/o0;

.field final synthetic b:Lr/o0$d;


# direct methods
.method public constructor <init>(Lr/o0;Lr/o0$d;)V
    .locals 0

    iput-object p1, p0, Lr/p0$e$a;->a:Lr/o0;

    iput-object p2, p0, Lr/p0$e$a;->b:Lr/o0$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lr/p0$e$a;->a:Lr/o0;

    iget-object v1, p0, Lr/p0$e$a;->b:Lr/o0$d;

    invoke-virtual {v0, v1}, Lr/o0;->C(Lr/o0$d;)V

    return-void
.end method
