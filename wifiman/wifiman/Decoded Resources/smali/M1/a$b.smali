.class LM1/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM1/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo/W;

    invoke-virtual {p0, p1, p2}, LM1/a$b;->c(Lo/W;I)LG1/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lo/W;

    invoke-virtual {p0, p1}, LM1/a$b;->d(Lo/W;)I

    move-result p1

    return p1
.end method

.method public c(Lo/W;I)LG1/t;
    .locals 0

    invoke-virtual {p1, p2}, Lo/W;->q(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG1/t;

    return-object p1
.end method

.method public d(Lo/W;)I
    .locals 0

    invoke-virtual {p1}, Lo/W;->p()I

    move-result p1

    return p1
.end method
