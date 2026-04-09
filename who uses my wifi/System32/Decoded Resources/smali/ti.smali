.class public final Lti;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final a:I

.field public final b:Lv91;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "ConstraintsCmdHandler"

    .line 2
    .line 3
    invoke-static {v0}, Lh80;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILqz0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lti;->a:I

    .line 5
    .line 6
    iget-object p2, p3, Lqz0;->g:Ll01;

    .line 7
    .line 8
    new-instance p3, Lv91;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p3, p1, p2, v0}, Lv91;-><init>(Landroid/content/Context;Ll01;Lu91;)V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, Lti;->b:Lv91;

    .line 15
    .line 16
    return-void
.end method
