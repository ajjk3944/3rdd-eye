.class final LF3/f;
.super LF3/z;
.source "SourceFile"


# instance fields
.field private final c:LF3/h;


# direct methods
.method constructor <init>(LF3/h;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, LF3/z;-><init>(II)V

    iput-object p1, p0, LF3/f;->c:LF3/h;

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF3/f;->c:LF3/h;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
