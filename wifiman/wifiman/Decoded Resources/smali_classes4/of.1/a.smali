.class public final Lof/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lof/a$a;,
        Lof/a$b;,
        Lof/a$c;
    }
.end annotation


# static fields
.field public static final a:Lof/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lof/a;

    invoke-direct {v0}, Lof/a;-><init>()V

    sput-object v0, Lof/a;->a:Lof/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
