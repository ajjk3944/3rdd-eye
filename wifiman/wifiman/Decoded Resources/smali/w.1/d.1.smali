.class public interface abstract Lw/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/d$a;
    }
.end annotation


# static fields
.field public static final a:Lw/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lw/d$a;->a:Lw/d$a;

    sput-object v0, Lw/d;->a:Lw/d$a;

    return-void
.end method


# virtual methods
.method public a(FFF)F
    .locals 1

    sget-object v0, Lw/d;->a:Lw/d$a;

    invoke-virtual {v0, p1, p2, p3}, Lw/d$a;->a(FFF)F

    move-result p1

    return p1
.end method

.method public b()Lr/i;
    .locals 1

    sget-object v0, Lw/d;->a:Lw/d$a;

    invoke-virtual {v0}, Lw/d$a;->c()Lr/i;

    move-result-object v0

    return-object v0
.end method
