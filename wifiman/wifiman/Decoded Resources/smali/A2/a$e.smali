.class public final LA2/a$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:J

.field private final c:[J

.field private final d:[Ljava/io/File;

.field final synthetic e:LA2/a;


# direct methods
.method private constructor <init>(LA2/a;Ljava/lang/String;J[Ljava/io/File;[J)V
    .locals 0

    .line 2
    iput-object p1, p0, LA2/a$e;->e:LA2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, LA2/a$e;->a:Ljava/lang/String;

    .line 4
    iput-wide p3, p0, LA2/a$e;->b:J

    .line 5
    iput-object p5, p0, LA2/a$e;->d:[Ljava/io/File;

    .line 6
    iput-object p6, p0, LA2/a$e;->c:[J

    return-void
.end method

.method synthetic constructor <init>(LA2/a;Ljava/lang/String;J[Ljava/io/File;[JLA2/a$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, LA2/a$e;-><init>(LA2/a;Ljava/lang/String;J[Ljava/io/File;[J)V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/io/File;
    .locals 1

    iget-object v0, p0, LA2/a$e;->d:[Ljava/io/File;

    aget-object p1, v0, p1

    return-object p1
.end method
