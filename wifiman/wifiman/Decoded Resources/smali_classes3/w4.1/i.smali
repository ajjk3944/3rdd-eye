.class public final Lw4/i;
.super Lw4/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw4/i$b;
    }
.end annotation


# instance fields
.field private final a:Lw4/l;

.field private final b:LC4/b;

.field private final c:LC4/a;

.field private final d:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lw4/l;LC4/b;LC4/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lw4/p;-><init>()V

    .line 3
    iput-object p1, p0, Lw4/i;->a:Lw4/l;

    .line 4
    iput-object p2, p0, Lw4/i;->b:LC4/b;

    .line 5
    iput-object p3, p0, Lw4/i;->c:LC4/a;

    .line 6
    iput-object p4, p0, Lw4/i;->d:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lw4/l;LC4/b;LC4/a;Ljava/lang/Integer;Lw4/i$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lw4/i;-><init>(Lw4/l;LC4/b;LC4/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static c()Lw4/i$b;
    .locals 2

    new-instance v0, Lw4/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw4/i$b;-><init>(Lw4/i$a;)V

    return-object v0
.end method


# virtual methods
.method public a()LC4/a;
    .locals 1

    iget-object v0, p0, Lw4/i;->c:LC4/a;

    return-object v0
.end method

.method public bridge synthetic b()Lw4/q;
    .locals 1

    invoke-virtual {p0}, Lw4/i;->d()Lw4/l;

    move-result-object v0

    return-object v0
.end method

.method public d()Lw4/l;
    .locals 1

    iget-object v0, p0, Lw4/i;->a:Lw4/l;

    return-object v0
.end method
