.class public final Lr/P$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/P$b;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/O;

.field final synthetic b:Lr/O$a;


# direct methods
.method public constructor <init>(Lr/O;Lr/O$a;)V
    .locals 0

    iput-object p1, p0, Lr/P$b$a;->a:Lr/O;

    iput-object p2, p0, Lr/P$b$a;->b:Lr/O$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lr/P$b$a;->a:Lr/O;

    iget-object v1, p0, Lr/P$b$a;->b:Lr/O$a;

    invoke-virtual {v0, v1}, Lr/O;->j(Lr/O$a;)V

    return-void
.end method
