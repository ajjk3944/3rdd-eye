.class public Lz5/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;

.field private final b:Lf5/b;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lf5/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/c$a;->a:Ljava/lang/Class;

    iput-object p2, p0, Lz5/c$a;->b:Lf5/b;

    return-void
.end method


# virtual methods
.method final a()Lf5/b;
    .locals 1

    iget-object v0, p0, Lz5/c$a;->b:Lf5/b;

    return-object v0
.end method

.method final b()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lz5/c$a;->a:Ljava/lang/Class;

    return-object v0
.end method
