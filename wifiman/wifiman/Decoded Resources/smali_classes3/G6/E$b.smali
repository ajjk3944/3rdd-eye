.class public LG6/E$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final c:LG6/E$b;

.field public static final d:LG6/E$b;

.field public static final e:LG6/E$b;

.field public static final f:LG6/E$b;


# instance fields
.field private final a:Z

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LG6/E$b;

    const/4 v1, 0x1

    const-string/jumbo v2, "STATE_ON"

    invoke-direct {v0, v1, v2}, LG6/E$b;-><init>(ZLjava/lang/String;)V

    sput-object v0, LG6/E$b;->c:LG6/E$b;

    new-instance v0, LG6/E$b;

    const-string/jumbo v1, "STATE_OFF"

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, LG6/E$b;-><init>(ZLjava/lang/String;)V

    sput-object v0, LG6/E$b;->d:LG6/E$b;

    new-instance v0, LG6/E$b;

    const-string/jumbo v1, "STATE_TURNING_ON"

    invoke-direct {v0, v2, v1}, LG6/E$b;-><init>(ZLjava/lang/String;)V

    sput-object v0, LG6/E$b;->e:LG6/E$b;

    new-instance v0, LG6/E$b;

    const-string/jumbo v1, "STATE_TURNING_OFF"

    invoke-direct {v0, v2, v1}, LG6/E$b;-><init>(ZLjava/lang/String;)V

    sput-object v0, LG6/E$b;->f:LG6/E$b;

    return-void
.end method

.method private constructor <init>(ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LG6/E$b;->a:Z

    iput-object p2, p0, LG6/E$b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, LG6/E$b;->a:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LG6/E$b;->b:Ljava/lang/String;

    return-object v0
.end method
