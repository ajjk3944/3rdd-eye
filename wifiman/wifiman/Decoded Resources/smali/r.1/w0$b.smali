.class public final Lr/w0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/w0;->c(Lr/q;FF)Lr/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Lr/K;


# direct methods
.method constructor <init>(FF)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lr/K;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Lr/K;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, p0, Lr/w0$b;->a:Lr/K;

    return-void
.end method


# virtual methods
.method public a(I)Lr/K;
    .locals 0

    iget-object p1, p0, Lr/w0$b;->a:Lr/K;

    return-object p1
.end method

.method public bridge synthetic get(I)Lr/I;
    .locals 0

    invoke-virtual {p0, p1}, Lr/w0$b;->a(I)Lr/K;

    move-result-object p1

    return-object p1
.end method
