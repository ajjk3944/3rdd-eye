.class public final LOa/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOa/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LOa/a$a;

.field private static final b:LOa/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LOa/a$a;

    invoke-direct {v0}, LOa/a$a;-><init>()V

    sput-object v0, LOa/a$a;->a:LOa/a$a;

    new-instance v0, LOa/b;

    invoke-direct {v0}, LOa/b;-><init>()V

    sput-object v0, LOa/a$a;->b:LOa/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LOa/a;
    .locals 1

    sget-object v0, LOa/a$a;->b:LOa/a;

    return-object v0
.end method
