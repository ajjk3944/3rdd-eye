.class public abstract Lbg/d$i;
.super Lag/d$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbg/d$i$a;,
        Lbg/d$i$b;
    }
.end annotation


# instance fields
.field public final b:Lbg/d$i$b;

.field public final c:Z

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/Character;

.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:Z

.field public final j:Z


# direct methods
.method protected constructor <init>(IZLbg/d$i$b;Ljava/lang/String;Ljava/lang/Character;Ljava/lang/String;ZZZ)V
    .locals 0

    invoke-direct {p0}, Lag/d$f;-><init>()V

    iput-boolean p2, p0, Lbg/d$i;->c:Z

    iput-object p3, p0, Lbg/d$i;->b:Lbg/d$i$b;

    iput p1, p0, Lbg/d$i;->d:I

    if-eqz p4, :cond_1

    iput-object p4, p0, Lbg/d$i;->e:Ljava/lang/String;

    iput-object p5, p0, Lbg/d$i;->f:Ljava/lang/Character;

    if-eqz p6, :cond_0

    iput-object p6, p0, Lbg/d$i;->g:Ljava/lang/String;

    iput-boolean p7, p0, Lbg/d$i;->h:Z

    iput-boolean p8, p0, Lbg/d$i;->i:Z

    iput-boolean p9, p0, Lbg/d$i;->j:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "label"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "segment str"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
