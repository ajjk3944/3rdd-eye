.class public final Lp0/S;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp0/S;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp0/S;

    invoke-direct {v0}, Lp0/S;-><init>()V

    sput-object v0, Lp0/S;->a:Lp0/S;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
