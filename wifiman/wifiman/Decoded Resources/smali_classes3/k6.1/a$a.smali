.class public final Lk6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lk6/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk6/a$a;

    invoke-direct {v0}, Lk6/a$a;-><init>()V

    sput-object v0, Lk6/a$a;->a:Lk6/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lk6/a;
    .locals 1

    new-instance v0, Lk6/a$a$a;

    invoke-direct {v0, p1, p2, p3, p4}, Lk6/a$a$a;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    return-object v0
.end method
