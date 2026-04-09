.class public final LF/m0$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/i1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m0;->s(LL0/d$c;)Lm0/i1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm0/U0;


# direct methods
.method constructor <init>(Lm0/U0;)V
    .locals 0

    iput-object p1, p0, LF/m0$i;->a:Lm0/U0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JLY0/t;LY0/d;)Lm0/Q0;
    .locals 0

    new-instance p1, Lm0/Q0$a;

    iget-object p2, p0, LF/m0$i;->a:Lm0/U0;

    invoke-direct {p1, p2}, Lm0/Q0$a;-><init>(Lm0/U0;)V

    return-object p1
.end method
