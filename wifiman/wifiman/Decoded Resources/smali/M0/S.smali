.class final LM0/S;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LM0/S;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/S;

    invoke-direct {v0}, LM0/S;-><init>()V

    sput-object v0, LM0/S;->a:LM0/S;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/text/StaticLayout$Builder;Z)V
    .locals 0

    invoke-static {p0, p1}, LM0/Q;->a(Landroid/text/StaticLayout$Builder;Z)Landroid/text/StaticLayout$Builder;

    return-void
.end method
