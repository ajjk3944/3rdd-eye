.class public final Lm0/Q0$a;
.super Lm0/Q0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/Q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lm0/U0;


# direct methods
.method public constructor <init>(Lm0/U0;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lm0/Q0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lm0/Q0$a;->a:Lm0/U0;

    return-void
.end method


# virtual methods
.method public a()Ll0/i;
    .locals 1

    iget-object v0, p0, Lm0/Q0$a;->a:Lm0/U0;

    invoke-interface {v0}, Lm0/U0;->getBounds()Ll0/i;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lm0/U0;
    .locals 1

    iget-object v0, p0, Lm0/Q0$a;->a:Lm0/U0;

    return-object v0
.end method
