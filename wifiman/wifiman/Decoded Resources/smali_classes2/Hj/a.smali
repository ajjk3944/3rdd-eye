.class public LHj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:LHj/a;

.field public static c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;


# instance fields
.field private final a:LEj/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LHj/a;

    invoke-direct {v0}, LHj/a;-><init>()V

    sput-object v0, LHj/a;->b:LHj/a;

    const-string v0, "1.6.99"

    sput-object v0, LHj/a;->c:Ljava/lang/String;

    const-class v0, LGj/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, LHj/a;->d:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LGj/d;

    invoke-direct {v0}, LGj/d;-><init>()V

    iput-object v0, p0, LHj/a;->a:LEj/a;

    return-void
.end method

.method public static final c()LHj/a;
    .locals 1

    sget-object v0, LHj/a;->b:LHj/a;

    return-object v0
.end method


# virtual methods
.method public a()LEj/a;
    .locals 1

    iget-object v0, p0, LHj/a;->a:LEj/a;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    sget-object v0, LHj/a;->d:Ljava/lang/String;

    return-object v0
.end method
