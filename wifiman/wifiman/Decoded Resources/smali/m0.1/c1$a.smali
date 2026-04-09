.class public final Lm0/c1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/i1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/c1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(JLY0/t;LY0/d;)Lm0/Q0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lm0/c1$a;->b(JLY0/t;LY0/d;)Lm0/Q0$b;

    move-result-object p1

    return-object p1
.end method

.method public b(JLY0/t;LY0/d;)Lm0/Q0$b;
    .locals 0

    new-instance p3, Lm0/Q0$b;

    invoke-static {p1, p2}, Ll0/n;->c(J)Ll0/i;

    move-result-object p1

    invoke-direct {p3, p1}, Lm0/Q0$b;-><init>(Ll0/i;)V

    return-object p3
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "RectangleShape"

    return-object v0
.end method
