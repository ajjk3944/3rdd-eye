.class public final Lo4/n$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo4/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lo4/g;

.field private final b:Lo4/k;

.field private final c:I

.field private final d:Z


# direct methods
.method private constructor <init>(Lo4/g;Lo4/k;IZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lo4/n$b;->a:Lo4/g;

    .line 4
    iput-object p2, p0, Lo4/n$b;->b:Lo4/k;

    .line 5
    iput p3, p0, Lo4/n$b;->c:I

    .line 6
    iput-boolean p4, p0, Lo4/n$b;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Lo4/g;Lo4/k;IZLo4/n$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lo4/n$b;-><init>(Lo4/g;Lo4/k;IZ)V

    return-void
.end method


# virtual methods
.method public a()Lo4/g;
    .locals 1

    iget-object v0, p0, Lo4/n$b;->a:Lo4/g;

    return-object v0
.end method
