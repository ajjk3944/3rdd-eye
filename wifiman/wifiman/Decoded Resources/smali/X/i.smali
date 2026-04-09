.class public final LX/i;
.super LX/a;
.source "SourceFile"


# instance fields
.field private final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;I)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, LX/a;-><init>(II)V

    iput-object p1, p0, LX/i;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LX/a;->d()V

    invoke-virtual {p0}, LX/a;->f()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, LX/a;->h(I)V

    iget-object v0, p0, LX/i;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LX/a;->e()V

    invoke-virtual {p0}, LX/a;->f()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, LX/a;->h(I)V

    iget-object v0, p0, LX/i;->c:Ljava/lang/Object;

    return-object v0
.end method
