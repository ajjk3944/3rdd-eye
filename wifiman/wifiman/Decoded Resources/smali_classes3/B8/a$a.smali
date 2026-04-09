.class public final LB8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LB8/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LB8/a$a;

    invoke-direct {v0}, LB8/a$a;-><init>()V

    sput-object v0, LB8/a$a;->a:LB8/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LB8/a;
    .locals 1

    new-instance v0, LB8/c;

    invoke-direct {v0}, LB8/c;-><init>()V

    return-object v0
.end method
